package bookmyshow.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Query;

import bookmyshow.dto.CustomerDto;
import bookmyshow.dto.TicketDetailsDto;

public class CustomerDao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction=entityManager.getTransaction();
public void insert(CustomerDto customerDto){
	entityTransaction.begin();
	entityManager.persist(customerDto);
	entityTransaction.commit();
}
public CustomerDto find(int id){
	
	CustomerDto customerDto=entityManager.find(CustomerDto.class, id);
	return customerDto;
	
}
public void insertTicketDetails(TicketDetailsDto detailsDto){
	entityTransaction.begin();
	entityManager.persist(detailsDto);
	entityTransaction.commit();
}
public List<TicketDetailsDto> fetchall(){
Query<TicketDetailsDto>	query=(Query<TicketDetailsDto>) entityManager.createQuery("select a from TicketDetailsDto a");
	return query.getResultList();
}
}
