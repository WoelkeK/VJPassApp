package pl.woelke.vjpassapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.woelke.vjpassapp.model.Dailypass;

@Repository
public interface DailypassRepository extends JpaRepository<Dailypass, Long> {
}
