package euro2024.grupa;

import euro2024.nationala.Nationala;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
public class Grupa {

    private Integer nrGrupa;
    private List<Nationala> nationale;

}
