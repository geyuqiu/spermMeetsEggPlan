package sperm.meets.egg.plan.be.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sperm.meets.egg.plan.be.domain.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
