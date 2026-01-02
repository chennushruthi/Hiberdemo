 package chennu.com.hiberdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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

        student st = new student();
        st.setId(1);
        st.setName("Shruthi");
        st.setDept("CSE");

        session.persist(st);

        t.commit();
        session.close();
        sf.close();

        System.out.println("Inserted successfully");
    }

    // UPDATE DATA
    public static void update_data() {

        Configuration con = new Configuration()
                .configure()
                .addAnnotatedClass(student.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();

        student st = new student();
        st.setId(1);   // Existing ID
        st.setName("Aswitha");
        st.setDept("CSE");

        session.merge(st);

        t.commit();
        session.close();
        sf.close();

        System.out.println("Updated successfully");
    }

    // DELETE DATA
    public static void delete_data() {

        Configuration con = new Configuration()
                .configure()
                .addAnnotatedClass(student.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();

        student st = session.find(student.class, 1);

        if (st != null) {
            session.remove(st);
            System.out.println("Deleted successfully");
        } else {
            System.out.println("Student not found");
        }

        t.commit();
        session.close();
        sf.close();
    }
}
