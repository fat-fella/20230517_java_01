package kh.lclass.openapi.water.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Dam {
	public static void main(String[] args) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://opendata.kwater.or.kr/openapi-data/service/pubd/dam/sluicePresentCondition/mnt/list"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=PFkXWkQyOjFQNO29i9X3s782S09%2FTz4ZD%2BxHawujnP00YmkqJxttz%2Bbxfr6LIICXmLgAmrlItuccGQR2acXsOQ%3D%3D&_type=json"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
        urlBuilder.append("&" + URLEncoder.encode("damcode","UTF-8") + "=" + URLEncoder.encode("2022510", "UTF-8")); /*수문제원현황 서비스의 댐코드조회 기능 참조*/
        urlBuilder.append("&" + URLEncoder.encode("stdt","UTF-8") + "=" + URLEncoder.encode("2020-10-01", "UTF-8")); /*조회시작일*/
        urlBuilder.append("&" + URLEncoder.encode("eddt","UTF-8") + "=" + URLEncoder.encode("2021-10-01", "UTF-8")); /*조회종료일*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*페이지당 줄수*/

        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());
    }
}

