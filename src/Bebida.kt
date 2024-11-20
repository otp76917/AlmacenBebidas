open class Bebida (val id:Int,val litros:Float,var precio:Float,val marca:String) {
    override fun toString(): String {
        return "id=$id litros=$litros precio=$precio marca=$marca"
    }
}