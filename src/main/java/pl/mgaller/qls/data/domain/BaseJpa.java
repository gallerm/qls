package pl.mgaller.qls.data.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Mariusz Galler <mariusz.galler@gmail.com>
 */
@MappedSuperclass
public class BaseJpa {

    @Id
    @GeneratedValue
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}