package Question7

class ClosureCheck {
    public static void main(String[] args) {
        List<Integer>list=[1,2,3,4,5]
//        list.eachWithIndex{ int entry, int i ->
//            printf "${entry}:"
//            printf "${i}\n"
//       }
        Closure closure={
            List a,b->
            if (a.contains(b))
                println("Present")
                else
                println("Not present")
        }
        closure(list,6)
    }
}
