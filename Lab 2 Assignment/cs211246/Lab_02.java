public class Lab_02 {
    public static void main(String[] args) 
    {
        int marksPf = 98;
        int marksPfLab = 93;
        int marksPhy = 84;
        int marksEng = 93;
        int marksCalc = 87;
        float cgpa = 0;

        float percentage = ((marksPf + marksPfLab + marksPhy + marksEng + marksCalc) * 100) / 500;
        
        if(percentage > 85) {
            cgpa = 4.0f;
        }
        else if (percentage > 79) {
            cgpa = 3.5f;
        }
        else if(percentage > 74) {
            cgpa = 3.0f;
        } 
        else if(percentage > 64) { 
            cgpa = 2.5f;
        }
        else if(percentage > 54) {
            cgpa = 2.0f;
        }
        else if(percentage > 44) {
            cgpa = 1.5f;  
        }
      
        System.out.println("\t\t--------------------");
        System.out.println("\t\tDHA SUFFA University");
        System.out.println("\t\t--------------------");
        System.out.println("\t\tTranscript");
        System.out.println("-----------------------------------------------------");
        System.out.println("Name = Saad Nisar Butt \t\t Roll no. = cs211246");
        System.out.println("-----------------------------------------------------");
        System.out.println("Subject\t\t\t\t\t Marks");
        System.out.println("-------------------------------------------------");
        System.out.println("Programming Fundamentals \t\t " + marksPf);
        System.out.println("Programming Fundamentals Lab \t\t " + marksPfLab);
        System.out.println("Applied Physics \t\t\t " + marksPhy);
        System.out.println("English \t\t\t\t " + marksEng);
        System.out.println("Calculus \t\t\t\t " + marksCalc);
        System.out.println("--------------------------------------------------");
        System.out.println("Percentage = \t\t\t\t " + percentage + "%");
        System.out.println("Cgpa = \t\t\t\t\t " + cgpa);
        System.out.println("--------------------------------------------------");
    }
}