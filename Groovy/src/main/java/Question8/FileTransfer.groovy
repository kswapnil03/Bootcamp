package Question8

class FileTransfer {
    public static void main(String[] args) {
        File file1=new File("/home/swapnil/gitrepo/Bootcamp/Groovy/src/main/java/Question8/file1")
        File file2=new File("/home/swapnil/gitrepo/Bootcamp/Groovy/src/main/java/Question8/file2")
        file2 << file1.text
        println("file tranferred successfully")
    }
}
