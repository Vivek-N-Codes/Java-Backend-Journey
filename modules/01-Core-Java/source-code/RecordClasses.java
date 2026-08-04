// class Alein{
//     private final int id;
//     private final String name;

//     public Alein(int id, String name){
//         this.id = id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public int hashCode() {
//         final int prime = 31;
//         int result = 1;
//         result = prime * result + id;
//         result = prime * result + ((name == null) ? 0 : name.hashCode());
//         return result;
//     }

//     @Override
//     public boolean equals(Object obj) {
//         if (this == obj)
//             return true;
//         if (obj == null)
//             return false;
//         if (getClass() != obj.getClass())
//             return false;
//         Alein other = (Alein) obj;
//         if (id != other.id)
//             return false;
//         if (name == null) {
//             if (other.name != null)
//                 return false;
//         } else if (!name.equals(other.name))
//             return false;
//         return true;
//     }

//     @Override
//     public String toString() {
//         return "Alein {id = " + id + ", name = " + name + "}";
//     }    
// }

record Alein(int id, String name){   //This one line is enough to cover all the features of the above 50 lines of code.
        // Canonical Constructor


        public Alein{        // compact canonical contructor
            if(id == 0)
                throw new IllegalArgumentException("id cannot be 0");
        }

}

// record class cannot extend any class but it can implements interfaces;

public class RecordClasses {
    public static void main(String[] args) {

        Alein a1 = new Alein(101, "Khushi");
        Alein a2 = new Alein(101, "Khushi");

        System.out.println(a1.equals(a2));

        System.out.println(a1);
    }
}
