package edu.altstu.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.NoArgsConstructor;

/**
 *
 * @author Евгений
 */
@Entity
@Table(schema = "converter", name = "comparations")
@NoArgsConstructor
public class Comparation implements Serializable {

    private static final long serialVersionUID = 2L;

    @Id
    private Integer id;

    @ManyToOne()
    @JoinColumn(name = "first_currency")
    private Currency first;

    @ManyToOne()
    @JoinColumn(name = "second_currency")
    private Currency second;

    private Double ratio;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Currency getFirst() {
        return first;
    }

    public void setFirst(Currency first) {
        this.first = first;
    }

    public Currency getSecond() {
        return second;
    }

    public void setSecond(Currency second) {
        this.second = second;
    }

    public Double getRatio() {
        return ratio;
    }

    public void setRatio(Double ratio) {
        this.ratio = ratio;
    }
}
