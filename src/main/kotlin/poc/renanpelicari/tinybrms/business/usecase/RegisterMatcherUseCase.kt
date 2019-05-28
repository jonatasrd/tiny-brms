package poc.renanpelicari.tinybrms.business.usecase

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import poc.renanpelicari.tinybrms.dataprovider.domain.Matcher
import poc.renanpelicari.tinybrms.dataprovider.repository.MatcherRepository

@Service
@Transactional
class RegisterMatcherUseCase(val matcherRepository: MatcherRepository) {

    fun execute(matcher: Matcher) = matcherRepository.save(matcher)
}
