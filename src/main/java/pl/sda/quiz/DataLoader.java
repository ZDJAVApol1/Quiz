package pl.sda.quiz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import pl.sda.quiz.entity.User;
import pl.sda.quiz.repository.UserRepository;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        User user = userRepository.findByUsername("test");
        if (user == null) {
            user = new User();
            user.setUsername("test");
            user.setPassword(passwordEncoder.encode("test"));
            user.setFirstName("Jan");
            user.setLastName("Kowalski");

            userRepository.save(user);
        }
    }
    
}
