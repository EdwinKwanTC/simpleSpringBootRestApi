package edwin.simplespringbootrestapi.cost;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CostController {
    @GetMapping("/cost/{id}")
    ResponseEntity<Cost> getCostById(@PathVariable(value = "id") Long id) {

        System.out.println("id" + " " + id.toString());
        Cost a = new Cost("edwin",100.0);
        return new ResponseEntity<>(a, HttpStatus.OK);
    }

    @GetMapping("/costs")
    ResponseEntity<List<Cost>> getCost(){
        List<Cost> costs = List.of(new Cost("edwin",100.0),new Cost("edwin",100.0));
        return new ResponseEntity<>(costs,HttpStatus.OK);
    }
}
