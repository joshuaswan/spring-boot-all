
/**
 * Created by joshua on 2017/10/9.
 */
@RestController
class HelloController {

    @RequestMapping("/")
    def hello() {
        "Hello World"
    }

}
