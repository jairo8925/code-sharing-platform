package platform;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CodeRepository extends CrudRepository<Code, Integer> {

    Code findById(int id);

    Code findByUniqueId(String uuid);

    List<Code> findAll();
}