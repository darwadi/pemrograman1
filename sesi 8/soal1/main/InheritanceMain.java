package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import model.Employee;
import model.Student;

public class InheritanceMain {

	public static void main(String[] args) throws ParseException {
		Student s = new Student();
		s.setNim("4510210032");
		s.setNama("Firly Nurlya R");
		s.setAlamat("Jl. Semar No. 372");
		s.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse("30-07-1992"));
		s.setNoHp("089637768580");

		Employee e = new Employee();
		e.setNip("4510210037");
		e.setNama("Rindah Gustri");
		e.setAlamat("Jl. Margonda");
		e.setTglLahir(new SimpleDateFormat("dd-MM-yyyy").parse("22-08-1992"));
		e.setNoHp("082124573837");

		showData(s);
		System.out.println("\n=================================\n");
		showData(e);
	}

	static void showData(Student s) {
		System.out.println("Class Student");
		System.out.println("NIM : " + s.getNim());
		System.out.println("Nama : " + s.getNama());
		System.out.println("Alamat : " + s.getAlamat());
		System.out.println("Tgl Lahir : " + new SimpleDateFormat("dd MMMM yyyy").format (s.getTglLahir()));
		System.out.println("No HP : " + s.getNoHp());
	}

	static void showData(Employee e) {
		System.out.println("Class Employee");
		System.out.println("NIP : " + e.getNip());
		System.out.println("Nama : " + e.getNama());
		System.out.println("Alamat : " + e.getAlamat());
		System.out.println("Tgl Lahir : " + new SimpleDateFormat("dd MMMM yyyy").format (e.getTglLahir()));
		System.out.println("No HP : " + e.getNoHp());
	}
}
