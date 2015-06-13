//sealed indica que solo se pueden definir sub tipos en el mismo archivo

sealed abstract class HttpMethod(){
	def body:String
	def bodyLength = body.length
}

case class Connect(body: String) extends HttpMethod
case class Delete (body: String) extends HttpMethod
case class Get    (body: String) extends HttpMethod
case class Head   (body: String) extends HttpMethod
case class Options(body: String) extends HttpMethod

