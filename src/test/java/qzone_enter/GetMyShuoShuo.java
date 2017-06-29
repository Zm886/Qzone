package qzone_enter;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.junit.Test;

public class GetMyShuoShuo {
	
	@Test
	public void getShuoshuo() throws IOException{
		Connection connect = Jsoup.connect("https://h5.qzone.qq.com/proxy/domain/taotao.qq.com/cgi-bin/emotion_cgi_msglist_v6?uin=280892750&ftype=0&sort=0&pos=0&num=20&replynum=100&g_tk=80316694&callback=_preloadCallback&code_version=1&format=jsonp&need_private_comment=1&qzonetoken=233cd63b8a9ce625cb4f52712c4bab54df20467ee9b8d92e94bf458623628c97112d6381b8d16324f624");
		connect.header("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.36");
		connect.cookie("cookie", "pgv_pvi=8368724992; pgv_si=s5686631424; _qpsvr_localtk=0.7327770851276565; pgv_pvid=7654689004; pgv_info=ssid=s812901855; ptui_loginuin=1162223173; ptisp=cm; RK=vucf0uGrQV; ptcz=b030c5d8d46ec0aa9450e3c1b390b0afef6c2bdd845872019e2dc47db11ad499; pt2gguin=o1162223173; uin=o1162223173; skey=@s3uc0bmdJ; p_uin=o1162223173; p_skey=ve2M75jv8vyMdcTiA**lmCCM*8wlzKDE6u2ZSJYM-DU_; pt4_token=JFEdKR0-LX*YMGzmKaVtqYWkfyJfaO5HUt5XhqsTFoo_; __Q_w_s__QZN_TodoMsgCnt=1; __Q_w_s_hat_seed=1; Loading=Yes; QZ_FE_WEBP_SUPPORT=1; cpu_performance_v8=1; rv2=807B27F22F618EADECA3051E50D1D85F035A5051412E3C0E53; property20=4CE1D28C04AC16235BC36B033C956EE3E418631E37B5AE57952AD39293D098DACF7581A42EE3EC3A; qzspeedup=sdch; qqmusic_uin=; qqmusic_key=; qqmusic_fromtag=; qzmusicplayer=qzone_player_280892750_1498196182525");
		Response execute = connect.execute();
		String body = execute.body();
		System.out.println(body);
	}
	
}
