package morozov.ru.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import morozov.ru.models.PostModel;

@Repository
public interface SimpleRepo extends JpaRepository<PostModel, Integer>{

}
