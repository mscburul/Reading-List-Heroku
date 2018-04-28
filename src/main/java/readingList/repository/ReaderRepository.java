package readingList.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import readingList.entity.Reader;


public interface ReaderRepository extends JpaRepository<Reader, String> {
    UserDetails findByUsername(String username);
}
