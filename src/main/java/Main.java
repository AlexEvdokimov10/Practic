import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[]args){
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
        Client client=new Client();
        client.setId(1);
        client.setName("Bobik");

        Bank bank=new Bank();
        bank.setName("wells fargo");

        EntityManager entityManager=entityManagerFactory.createEntityManager();
        entityManager.persist(client);
        entityManager.persist(bank);
        entityManager.getTransaction().commit();
        entityManagerFactory.close();

    }
}