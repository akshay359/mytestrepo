package com.jpa.test;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		
	ApplicationContext context=	SpringApplication.run(BootjpaexampleApplication.class, args);
	 UserRepository userRepository = context.getBean(UserRepository.class);
//	User user=new User(); 
//	user.setName("akshay");
//	user.setCity("pune");
//	user.setStatus("java prgm");
//	User save = userRepository.save(user);
//	System.out.println(" Record inserted successfully:"+save);
	
//	User user1=new User();
//	user1.setName("kailas");
//	user1.setCity("pune");
//	user1.setStatus("SAP consultant");
//	
//	User user2=new User();
//	user2.setName("amit");
//	user2.setCity("kolkata");
//	user2.setStatus("Python programming");
	
//	User result = userRepository.save(user2);
//	List<User> users = List.of(user1,user2);
//	Iterable<User> result = userRepository.saveAll(users);
//	result.forEach(userr->{
//		System.out.println(userr);
//	});
//	
//	System.out.println("Saved user"+result);
//	System.out.println("done");	
	
	//getting element by id
//	Optional<User> optional = userRepository.findById(1);
//	User user = optional.get();
//	System.out.println(user);
//	user.setName("Akshay Kadam");
//	User result = userRepository.save(user);
//	System.out.println("result"+result);
	
	//getting all elements
//	Iterable<User> find = userRepository.findAll();
//	Iterator<User> iterator = find.iterator();
//	while(iterator.hasNext())
//	{
//		User user=iterator.next();
//		System.out.println(user);
//		
//	}
	 //delete single enitity
//	userRepository.deleteById(1);
//	 System.out.println("deleted");
//	  
	 //delete all 
//	 Iterable<User> allusers = userRepository.findAll();
//	 allusers.forEach(user->System.out.println(user));
//	 userRepository.deleteAll(allusers);
	 
	 
	// Custom finder method (own created method in interface UserRepositor)
	 
//	 List<User> users = userRepository.findByName("Akshay");
//	 users.forEach(e->System.out.println(e)); 
		
	 
	 //find element by name and city from db
//	 List<User> users=userRepository.findByNameAndCity("abhishek","kolkata");
//	 users.forEach(t->System.out.println(t));
	 
	 List<User> likename = userRepository.findByNameLike("shek");
	 likename.forEach(e->System.out.println(e));
	}

} 
 