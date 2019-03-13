package Band.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Band.beans.Musician;

@Repository
public interface MusicianRepository extends JpaRepository<Musician, Long>{

}
