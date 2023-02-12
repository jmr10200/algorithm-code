package programmers.basic.level1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Level1Day18 {

    /**
     * 신고 결과 받기
     * @param id_list 이용자의 ID 가 담긴 문자열 배열 (소문자)
     * @param report 각 이용자가 신고한 ID 의 정보가 담긴 문자열 배열 , "이용자ID 신고한ID" (공백구분)
     * @param k 정지 기준이 되는 신고 횟수
     * @return 각 유저별로 처리 결과 메일을 받은 횟수, id_list 배열 순서로 리턴
     * 한 유저를 여러번 신고할 수 있지만 신고 횟수는 1번으로 처리된다.
     * k 번 이상 신고된 유저는 게시판 이용이 정지되며 신고한 유저 전원에게 정지 사실을 메일로 발송한다.
     */
    public int[] solution1(String[] id_list, String[] report, int k) {
        int[] answer = {};
        // 전체 유저 생성
        Map<String, ReportDetail> usersMap = new HashMap<>();
        for (String id : id_list) {
            usersMap.put(id, new ReportDetail(new ArrayList<>(), 0, k));
        }
        // distinct() 사용
        List<String> deduplicatedReport = Arrays.stream(report).distinct().collect(Collectors.toList()); // 중복제거
        // 신고 확인
        for (String r : deduplicatedReport) {
            String[] reportDetail = r.split(" "); // 공백으로 잘라 0번 이용자, 1번 신고자
            // 이용자 셋팅
            ReportDetail fromId = usersMap.get(reportDetail[0]);
            fromId.addReportId(reportDetail[1]);

            // 신고 받은사람 카운트 +1
            ReportDetail toId = usersMap.get(reportDetail[1]);
            toId.countReport();
        }
        answer = new int[id_list.length];
        // 신고 결과 체크
        for (int i = 0; i < id_list.length; i++) {
            // 사용자가 신고한 아이디들을 가져온다
            List<String> reportIds = usersMap.get(id_list[i]).getReportIds();
            // 신고한 아이디들을 확인하여 정지 대상이면 카운트한다
            for (String id : reportIds) {
                if (usersMap.get(id).block) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }

    /**
     * 신고 정보를 담을 클래스
     */
    class ReportDetail {

        /** 신고한 ID 리스트 */
        List<String> reportIds;

        /** 신고받은 횟수 */
        Integer reportedCount;

        /** 정지 여부 : 정지가 아니면 false, 정지면 true */
        Boolean block;

        /** 정지 기준 */
        Integer k;

        public ReportDetail(List<String> reportIds, Integer reportedCount, Integer k){
            this.reportIds = reportIds;
            this.reportedCount = reportedCount;
            this.block = Boolean.FALSE;
            this.k = k;
        }

        public List<String> getReportIds() {
            return reportIds;
        }

        public Integer getReportedCount() {
            return reportedCount;
        }

        public void addReportId(String reportId) {
            reportIds.add(reportId);
        }

        public void countReport() {
            reportedCount++;
            if (this.reportedCount >= k) {
                // 신고횟수가 정지횟수에 이상이면 정지
                block = Boolean.TRUE;
            }
        }
    }

}
