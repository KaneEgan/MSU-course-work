public class GradeItem{

   private String studentId;
   private int gradeItem;
   private String courseId;
   private String itemType;
   private String date;
   private int maxScore;
   private int actualScore;
   
   public GradeItem (String studentId, int gradeItem, String courseId,
                     String itemType, String date, int maxScore,
                     int actualScore) {
                     
      if ((studentId == null) || (studentId.length() == 0)) {
         throw new IllegalArgumentException("Student ID is empty or
                                              an invalid entry");                
      }
      
      if ((gradeItem == null) || (gradeItem.length() == 0)) {
         throw new IllegalArgumentException("Grade Item is empty or an invalid entry");
      }
   }                  

   // *************************************************************************
}