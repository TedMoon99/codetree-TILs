import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))

    var (a, b, c, d) = br.readLine().trim().split(" ").map { it.toInt() }
    var time = 0
    while(a != c || b != d){

        if (b+1 == 60){
            b = 0
            a++
            time ++
            continue
        }
        b++
        time++
    }
    bw.write(time.toString())

    bw.flush()
    bw.close()
}