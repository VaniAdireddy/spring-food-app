package com.foodapp.springfoodapp.usersecurity.serviceImpl;//package com.app.restaurant_app.serviceImpl;



import com.foodapp.springfoodapp.exception.UserException;
import com.foodapp.springfoodapp.usersecurity.config.JwtProvider;
import com.foodapp.springfoodapp.usersecurity.modual.User;
import com.foodapp.springfoodapp.usersecurity.modual.UserRepository;
import com.foodapp.springfoodapp.usersecurity.service.UserService;
import lombok.RequiredArgsConstructor;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserServiceImplementation implements UserService {


    private final UserRepository userRepository;
    private final JwtProvider jwtProvider;
    private final PasswordEncoder passwordEncoder;

    @Override
    public User findUserByEmail(String userName) throws UserException {
        User user = userRepository.findByEmail(userName);
        // if user != null return user
        if (user != null) {
            return user;
        }

        return user;
    }
    @Override
    public User findUserProfileByJwt(String jwt) throws UserException {
//        These business logic are very simple first. we Created GetEmailFromJWtToken.
//        Then take the reference for findbymail.
        String email = jwtProvider.getEmailFromJwtToken(jwt);
        User user = userRepository.findByEmail(email);

        if (user != null) {
            throw new UserException("Not found");
        } else {
            System.out.println("email user " + user.getEmail());
            return user;
        }

    }

//	private final PasswordResetTokenRepository passwordResetTokenRepository;
//	private final JavaMailSender javaMailSender;


//	@Override
//	public List<User> findAllUsers() {
//		// TODO Auto-generated method stub
//		return userRepository.findAll();
//	}
//
//	@Override
//	public List<User> getPenddingRestaurantOwner() {
//
//		return userRepository.getPenddingRestaurantOwners();
//	}
//
//	@Override
//    public void updatePassword(User user, String newPassword) {
//        user.setPassword(passwordEncoder.encode(newPassword));
//        userRepository.save(user);
//    }
//
//	@Override
//	public void sendPasswordResetEmail(User user) {
//
//		// Generate a random token (you might want to use a library for this)
//        String resetToken = generateRandomToken();
//
//        // Calculate expiry date
//        Date expiryDate = calculateExpiryDate();
//
//        // Save the token in the database
//        PasswordResetToken passwordResetToken = new PasswordResetToken(resetToken,user,expiryDate);
//        passwordResetTokenRepository.save(passwordResetToken);
//
//        // Send an email containing the reset link
//        sendEmail(user.getEmail(), "Password Reset", "Click the following link to reset your password: http://localhost:3000/account/reset-password?token=" + resetToken);
//	}
//	private void sendEmail(String to, String subject, String message) {
//	    SimpleMailMessage mailMessage = new SimpleMailMessage();
//
//	    mailMessage.setTo(to);
//	    mailMessage.setSubject(subject);
//	    mailMessage.setText(message);
//
//	    javaMailSender.send(mailMessage);
//	}
//	private String generateRandomToken() {
//	    return UUID.randomUUID().toString();
//	}
//	private Date calculateExpiryDate() {
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(new Date());
//        cal.add(Calendar.MINUTE, 10);
//        return cal.getTime();
//    }
//
//	@Override
//	public User findUserByEmail(String username) throws UserException {
//
//		User user=userRepository.findByEmail(username);
//
//		if(user!=null) {
//
//			return user;
//		}
//
//		throw new UserException("user not exist with username "+username);
//	}


}
