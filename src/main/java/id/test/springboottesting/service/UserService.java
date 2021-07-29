package id.test.springboottesting.service;

import id.test.springboottesting.exception.UserRegistrationException;
import id.test.springboottesting.model.User;
import id.test.springboottesting.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.context.annotation.PropertySource;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Optional;

/***
 * Project Name     : spring-boot-testing
 * Username         : Teten Nugraha
 * Date Time        : 12/18/2019
 * Telegram         : @tennugraha
 */

@Service
@Transactional
@PropertySource({"classpath:notifications-${spring.profiles.active}.properties"})
public class UserService {

    private final UserRepository userRepository;

    @Value("${notifications.emails}")
    private String[] testEmail;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> login(String email, String password) {
        return userRepository.login(email, password);
    }

    public User createUser(User user) {
        Optional<User> userOptional = userRepository.findByEmail(user.getEmail());
        if(userOptional.isPresent()) {
            throw new UserRegistrationException("User with email "+ user.getEmail()+" already exists");
        }

        return userRepository.save(user);
    }

    public User updateUser(User user) {
        return userRepository.save(user);
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public Optional<User> findUserById(Long id) {
        return userRepository.findById(id);
    }

    public String[] getEmails() {
        return testEmail;
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
