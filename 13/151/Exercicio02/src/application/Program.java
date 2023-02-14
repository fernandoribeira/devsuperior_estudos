package application;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

import model.Comment;
import model.Post;

public class Program {
	public static void main(String[] args) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		Instant moment;
		String title;
		String content;
		int likes;
		Comment c1;
		Comment c2;

		moment = LocalDateTime.parse("21/06/2018 13:05:44", dtf).toInstant(ZoneOffset.of("-03:00"));
		title = "Traveling to New Zealand";
		content = "I'm going to visit this wonderfull country!";
		likes = 12;
		
		Post p1 = new Post(moment, title, content, likes);
		
		c1 = new Comment("Have a nice trip");
		c2 = new Comment("Wow that's awesome!");
		p1.addComments(c1);
		p1.addComments(c2);
		
		moment = LocalDateTime.parse("28/07/2018 23:14:19", dtf).toInstant(ZoneOffset.of("-03:00"));
		title = "Good night guys";
		content = "See you tomorrow";
		likes = 5;

		Post p2 = new Post(moment, title, content, likes);
		
		c1 = new Comment("Good night");
		c2 = new Comment("May the Force be with you");
		p2.addComments(c1);
		p2.addComments(c2);
		
		System.out.println(p1);
		System.out.println(p2);
		
	}
}
