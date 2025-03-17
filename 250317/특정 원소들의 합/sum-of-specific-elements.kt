import java.io.*


fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
    val inputList = mutableListOf<List<Int>>()

    // input 
    (0..3).forEach{ inputList.add(br.readLine().split(" ").map{it.toInt()})}
    
    var result = 0
    (0 .. 3).forEach{ row -> 
        (0.. row).forEach{ col ->
            result += inputList[row][col]
        }
    }
    bw.write(result.toString())

    bw.flush()
    bw.close()
}