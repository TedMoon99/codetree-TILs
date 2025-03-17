import java.io.*;

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    (0 .. 4).forEach{ index ->
        val input = br.readLine().split(" ").map{ it.toUpperCase() }
        bw.write(input.joinToString(" ") + "\n")
    }

    bw.flush()
    bw.close()
}