//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main()
{
    var almacen:Almacen = Almacen()
    /*
    almacen.agregar(Agua(1,1.5f,0.45f,"Fuensanta","Madrid"))
    almacen.eliminar(1)
    for (i in 1..25)
    {
        almacen.agregar(Agua(i,1.5f,0.45f,"Fuensanta","Madrid"))
    }

    almacen.mostrar()
    println(almacen.calcular())
    for (i in 1..25)
    {
        almacen.eliminar(i)
    }
    println(almacen.calcular())
     */
    almacen.agregar(Azucarada(1,1f,50f,"coca-cola",40f,true))
}