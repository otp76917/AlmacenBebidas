class Azucarada (id:Int,litros:Float,precio:Float,marca:String,val porcentaje:Float,var promocion:Boolean) : Bebida(id,litros,precio,marca){
    override fun toString(): String {
        return "id=$id litros=$litros precio=$precio marca=$marca porcentaje=$porcentaje promocion=$promocion"
    }
    init {
        if(this.promocion) this.precio *= 0.9f
        println(precio)
    }
}