package com.worklab.myapp.service.token;

import com.worklab.myapp.repository.ConfirmationToken;
import com.worklab.myapp.repository.token.ConfirmationTokenRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {

private final ConfirmationTokenRepository confirmationTokenRepository;
public void saveConfirmationToken(ConfirmationToken confirmationToken){
    confirmationTokenRepository.save(confirmationToken);
    }
    public void deleteConfirmationToken(Long id){
    confirmationTokenRepository.deleteById(id);
    }

    public Optional<ConfirmationToken> findConfirmationTokenByToken(String token) {
        return confirmationTokenRepository.findConfirmationTokenByConfirmationToken(token);
    }
}
