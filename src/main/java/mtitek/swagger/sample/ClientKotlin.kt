package mtitek.swagger.sample

import okhttp3.HttpUrl
import java.net.MalformedURLException
import java.net.URL
import javax.ws.rs.ApplicationPath
import javax.ws.rs.core.Application

@ApplicationPath("/")
class ClientKotlin : Application() {
    private val CONST = "users"

    @get:Throws(MalformedURLException::class)
    val endpointTest1: Unit
        get() {
            val aseUrl1 = HttpUrl.get("http://api.example.com/v1/megaRequest")
            println("sdf")
            URL("")
        }
}