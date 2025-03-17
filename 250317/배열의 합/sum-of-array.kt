import java.io.*;

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    (0 .. 3).forEach{ index ->
        val input = br.readLine().split(" ").map{it.toInt()}
        bw.write("${input.sum()}\n")
    }

    bw.flush()
    bw.close()
}