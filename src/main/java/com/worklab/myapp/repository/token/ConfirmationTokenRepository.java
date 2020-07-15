package com.worklab.myapp.repository.token;

import com.worklab.myapp.repository.ConfirmationToken;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken,Long> {
    Optional<ConfirmationToken> findConfirmationTokenByConfirmationToken(String token);
}
