package gsm.java_project.repository;

import gsm.java_project.dto.BoardDTO;
import gsm.java_project.entity.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {

}
