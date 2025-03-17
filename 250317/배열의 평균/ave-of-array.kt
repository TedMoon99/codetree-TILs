import java.io.*

fun main(){
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.`out`))
    val inputList = mutableListOf<List<Int>>()
    // input
    (0 .. 1).forEach{ index ->
        val temp = br.readLine().split(" ").map{ it.toInt() }
        inputList.add(temp)
    }
    // 가로 평균
    (0 .. 1).forEach{ index ->
        val temp = (inputList[index].sum() / 4).toDouble()
        val result = String.format("%.1f ", temp)
        bw.write(result)
    }
    bw.write("\n")
    // 세로 평균
    (0..3).forEach{ index ->
        val temp = ((inputList[0][index] + inputList[1][index]) / 2).toDouble()
        val result = String.format("%.1f ", temp)
        bw.write(result)
    }
    bw.write("\n")
    // 전체 평균
    val total = inputList.map{ 
        it.sum()
    }
    val average = (total.sum() / 8).toDouble()
    val result = String.format("%.1f", average)
    bw.write(result)


    bw.flush()
    bw.close()
}