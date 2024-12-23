package lesson7.homework;

public class ClinicSimulation {

  public static void main(String[] args) {
        Patient patient1 = new Patient("Иван Иванов", "1");
        Patient patient2 = new Patient("Петр Петров", "2");
        Patient patient3 = new Patient("Сидор Сидоров", "3");

        Therapist therapist = new Therapist();

        therapist.assignDoctor(patient1);
        therapist.assignDoctor(patient2);
        therapist.assignDoctor(patient3);
  }
}
