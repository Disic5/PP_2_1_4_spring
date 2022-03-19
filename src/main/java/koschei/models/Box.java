package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Box {

    private Rabbit4 rabbit4; //  В сундуке заяц
@Autowired
    public Box(Rabbit4 rabbit4) {
        this.rabbit4 = rabbit4;
    }

    @Override
    public String toString() {
        return ", в сундуке заяц " + rabbit4.toString();
    }
}
