 package chennu.com.hiberdemo;

import java.util.List;
import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App {

    // MAIN METHOD – Program starts here
    public static void main(String[] args) {

        System.out.println("MAIN METHOD STARTED");

        // Call ONLY ONE method at a time
        insert_data();
        // update_data();
        // delete_data();
    }

    // INSERT DATA
    public static void insert_data() {

        Configuration con = new Configuration()
                .configure()
                .addAnnotatedClass(student.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();
        //Random r=new Random();
        //for(int i=1;i<=60;i++) {
        	//student s=new student();
        	//s.setId(i);
        	//s.setName("A4" + i);
        	//s.setMarks(r.nextInt(100));
        	//session.persist(s);
           	
        //}
        //t.commit();
        
        //System.out.println("Records Inserted successfully");
        Query q=session.createQuery("from student");
        List<student> students=q.list();
        for(student s:students) {
        	System.out.println(s);
        }
        
    }
}
