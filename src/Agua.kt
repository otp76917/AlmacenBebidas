class Agua (id:Int,litros:Float,precio:Float,marca:String,val origen:String) : Bebida(id,litros,precio,marca){
    override fun toString(): String {
        return "id=$id litros=$litros precio=$precio marca=$marca origen=$origen"
    }
}