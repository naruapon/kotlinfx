/**
 * Created by naruapon on 1/6/2560.
 */
//import javax.swing.JDialog
import javax.swing.JFrame
import javax.swing.JOptionPane


fun main(agrs: Array<String>){
    val frame = JFrame("VPrincipal Kotlin")
    frame.contentPane = VPrincipal().panel   //panel form VPrinciple.java
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.pack()
    frame.isVisible = true

}

fun getData(m: String){
    println(m)
    JOptionPane.showMessageDialog(null,m)
}