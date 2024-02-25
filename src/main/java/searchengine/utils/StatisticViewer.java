package searchengine.utils;

import searchengine.model.Site;
import searchengine.repository.LemmaRepo;
import searchengine.repository.PageRepo;
import searchengine.repository.SiteRepo;

import java.util.Optional;

public class StatisticViewer {
    public static int totalCountOfPages(){
        return (int) PageRepo.pageRepository.count();
    }

    public static int totalCountOfLemmas() {
        return (int) LemmaRepo.lemmaRepository.count();
    }

    public static int countPagesBySiteName(String name) {
        return (int) PageRepo.pageRepository.countBySiteName(name);
    }

    public static int countLemmasBySiteName(String name) {
        return (int) LemmaRepo.lemmaRepository.countBySiteName(name);
    }

    public static String getStatusBySiteName(String name) {
        Optional siteOptional = SiteRepo.siteRepository.findByName(name);
        if (siteOptional.isEmpty()) return "FAILED";
        Site site = (Site) siteOptional.get();
        return site.getStatus().toString();
    }

    public static String getLastErrorBySiteName(String name) {
        Optional siteOptional = SiteRepo.siteRepository.findByName(name);
        if (siteOptional.isEmpty()) return "";
        Site site = (Site) siteOptional.get();
        return site.getLastError();
    }

    public static long getStatusTimeBySiteName(String name) {
        Optional siteOptional = SiteRepo.siteRepository.findByName(name);
        if (siteOptional.isEmpty()) return 0L;
        Site site = (Site) siteOptional.get();
        return site.getStatusTime().getTime();
    }
}
