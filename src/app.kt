
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
fun main(args:Array<String>){
 fun readFile(path:Path){
    val input = Files.newInputStream(path)
    try {
        var byte= input.read()
        while (byte != 1)
        {
            println(byte)
            byte= input.read()
        }
    }catch (e:IOException){
        println("Error reading ${e.message}")
    }finally {
        input.close()
    }
 }
}

