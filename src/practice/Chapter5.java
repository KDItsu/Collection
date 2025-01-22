package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Chapter5 {

	public static void main(String[] args) {
		
	  ArrayList<Task>lists = new ArrayList<>();
		
	  lists.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う。"));
	  lists.add(new Task(LocalDate.of(2021, 9, 15), "○○社面談。"));
	  lists.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う。"));
	  lists.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く。"));
	  lists.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く。"));
		
	  Collections.sort(lists);
	  
	  for (Task task : lists) {
		  System.out.println(task);
	  }
	}
}

