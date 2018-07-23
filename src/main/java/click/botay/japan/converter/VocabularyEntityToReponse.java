package click.botay.japan.converter;

import click.botay.japan.domain.VocabularyResponse;
import click.botay.japan.entity.VocabularyEntity;
import org.springframework.stereotype.Component;

@Component
public class VocabularyEntityToReponse {
    public VocabularyResponse coverter(VocabularyEntity vocabularyEntity){
        VocabularyResponse vocabularyResponse = new VocabularyResponse();
        vocabularyResponse.setIdVocabulary(vocabularyEntity.getId());
        vocabularyResponse.setTuVung(vocabularyEntity.getTuVung());
        vocabularyResponse.setKanJi(vocabularyEntity.getKanJi());
        vocabularyResponse.setPhienAm(vocabularyEntity.getPhienAm());
        vocabularyResponse.setNghia(vocabularyEntity.getNghia());
        vocabularyResponse.setViDu(vocabularyEntity.getViDu());
        return vocabularyResponse;
    }

}
