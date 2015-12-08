package pl.mgaller.qls.data.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mgaller.qls.data.domain.QuestionJpa;

/**
 *
 * @author Mariusz Galler <mariusz.galler@gmail.com>
 */
public interface QuestionDao extends JpaRepository<QuestionJpa,Long> {
}
