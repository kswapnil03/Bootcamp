package Question9
class OddLines {
    public static void main(String[] args) {
        File file1=new File("/home/swapnil/gitrepo/Bootcamp/Groovy/src/main/java/Question9/file1")
        File file1Copy=new File("/home/swapnil/gitrepo/Bootcamp/Groovy/src/main/java/Question9/file2")
        file1Copy << file1
    }
}
