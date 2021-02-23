package io.springcore.Q5;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class SnapDragon implements Processors {
 public void process() {
	 System.out.println("I am the best processor in the market\n i am made by the company Qualcomm");
 }
}
